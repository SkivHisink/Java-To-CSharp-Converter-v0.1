import java.lang.*;
import org.Rescue.rjni.*;
/***********************************************************************

    Testbed for the classifier.lib.

  java ClassifierTest modelName

    Rod Hanks   June 2002 / May 2003

************************************************************************/
class ClassifierTest
{
  public static void main(String[] args)
  {
    if (args.length < 1)
    {
      System.err.println(
                     "Usage: java ClassifierTest <modelFileName> [-quick]");
      System.exit(-1);
    }

    int err = 0;
    RescueContext rContext = new RescueContext();
    RescueStreamReporter reporter = new RescueStreamReporter();
    RescueModel unclassifiedModel = 
                              RescueModel.UnarchiveModel(rContext, args[0]);

    if (unclassifiedModel == null)
    {
      System.err.println("Unable to open "+args[0]);
      System.exit(-1);
    }

    boolean doAll = true;
    if (args.length >= 2)
    {
      if (args[1].equals("-quick"))
      {
        doAll = false;
      }
    }
    RescueFlavourFactory[] flavourFactories = new RescueFlavourFactory[0];
    RescueClassifier classifier = new RescueClassifier(flavourFactories,
                                                       false);
/*
  Standard flavours are provided automatically.
*/
    RescueClassificationContext context = 
                    new RescueClassificationContext(unclassifiedModel,
                                                     args[0], reporter);

    err = classifier.apply(context, doAll);
    
    cSetString badRules = new cSetString();
    if (classifier.IsFlavour(context, "Multi-Block", badRules)  == false)
    {
      System.out.println("Failed IsFlavour rule");
      int howMany = (int) badRules.Count();
      for (int loop = 0; loop < howMany; loop++)
      {
        String badName = badRules.NthObject(loop);
        System.out.println(badName);
      }
    }

    RescueFlavour mbFlav = classifier.FlavourNamed("Multi-Block");
    mbFlav.unregisterRule("class RescueMultiBlockRule");
    context.reset();
/*
  Careful!  If you unregister a rule YOU MUST reset any contexts which have
  been used with that rule.  If you do not YOU WILL get a seg fault.
*/
    mbFlav.classify(context, badRules);
    System.out.println("Failed rule names from Multi-Block rule");
    int howMany = (int) badRules.Count();
    for (int loop = 0; loop < howMany; loop++)
    {
      String badName = badRules.NthObject(loop);
      System.out.println(badName);
    }

    unclassifiedModel.dispose();
    classifier.dispose();
    context.dispose();

  }
}
