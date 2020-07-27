using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueFlavour : org.Rescue.rjni.RjniBaseClass
{


  protected RescueFlavour(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueFlavour()
  {
    nativeNdx = Create_RescueFlavour0();
  }

  public int registerRule(RescueRule rule)
  {
    int myReturn = registerRule1(nativeNdx
                                   ,(rule == null) ? 0 : rule.nativeNdx);
    return myReturn;
  }

  public bool unregisterRule(string ruleName)
  {
    bool myReturn = unregisterRule2(nativeNdx
                                         ,ruleName);
    return myReturn;
  }

  public RescueRule classify(RescueClassificationContext context,
                               bool doAll)
  {
    long returnNdx = classify3(nativeNdx
                               ,(context == null) ? 0 : context.nativeNdx
                               ,doAll);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueRule myReturn = new RescueRule(returnNdx);
      String className = myReturn.ClassName();
      if (className.equals("class RescueBlockAndUnitNumbersRule"))
      {
        myReturn = new RescueBlockAndUnitNumbersRule(returnNdx);
      }
      else if (className.equals("class RescueBlockNameRule"))
      {
        myReturn = new RescueBlockNameRule(returnNdx);
      }
      else if (className.equals("class RescueBUHRule"))
      {
        myReturn = new RescueBUHRule(returnNdx);
      }
      else if (className.equals("class RescueFaultLimitRule"))
      {
        myReturn = new RescueFaultLimitRule(returnNdx);
      }
      else if (className.equals("class RescueGoodVolumeRule"))
      {
        myReturn = new RescueGoodVolumeRule(returnNdx);
      }
      else if (className.equals("class RescueHaveFaultRelationshipsRule"))
      {
        myReturn = new RescueHaveFaultRelationshipsRule(returnNdx);
      }
      else if (className.equals("class RescueHaveFaultRule"))
      {
        myReturn = new RescueHaveFaultRule(returnNdx);
      }
      else if (className.equals("class RescueHaveTipLoopRule"))
      {
        myReturn = new RescueHaveTipLoopRule(returnNdx);
      }
      else if (className.equals("class RescueLayerToUnitRule"))
      {
        myReturn = new RescueLayerToUnitRule(returnNdx);
      }
      else if (className.equals("class RescueLGRIDRule"))
      {
        myReturn = new RescueLGRIDRule(returnNdx);
      }
      else if (className.equals("class RescueMultiBlockRule"))
      {
        myReturn = new RescueMultiBlockRule(returnNdx);
      }
      else if (className.equals("class RescueNoGlobalsRule"))
      {
        myReturn = new RescueNoGlobalsRule(returnNdx);
      }
      else if (className.equals("class RescueOneBUPerURule"))
      {
        myReturn = new RescueOneBUPerURule(returnNdx);
      }
      else if (className.equals("class RescueParameterizedSurfaceRule"))
      {
        myReturn = new RescueParameterizedSurfaceRule(returnNdx);
      }
      else if (className.equals("class RescuePassRule"))
      {
        myReturn = new RescuePassRule(returnNdx);
      }
      else if (className.equals("class RescueRefIdRule"))
      {
        myReturn = new RescueRefIdRule(returnNdx);
      }
      else if (className.equals("class RescueSplitNodesRule"))
      {
        myReturn = new RescueSplitNodesRule(returnNdx);
      }
      else if (className.equals("class RescueStandardModelPropertyGroupingRule"))
      {
        myReturn = new RescueStandardModelPropertyGroupingRule(returnNdx);
      }
      else if (className.equals("class RescueStandardPropertyGroupingRule"))
      {
        myReturn = new RescueStandardPropertyGroupingRule(returnNdx);
      }
      else if (className.equals("class RescueUnitNameRule"))
      {
        myReturn = new RescueUnitNameRule(returnNdx);
      }
      else if (className.equals("class RescueVersionRule"))
      {
        myReturn = new RescueVersionRule(returnNdx);
      }
      return myReturn;
    }
  }

  public void classify(RescueClassificationContext context,
                       cSetString failedRuleNames)
  {
    classify4(nativeNdx
             ,(context == null) ? 0 : context.nativeNdx
             ,(failedRuleNames == null) ? 0 : failedRuleNames.nativeNdx);
  }

  public void print(RescueClassificationContext context,
                    RescueReporter reporter)
  {
    print5(nativeNdx
          ,(context == null) ? 0 : context.nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public void print(RescueReporter reporter)
  {
    print6(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public void name(string name)
  {
    name8(nativeNdx
         ,name);
  }

  public string getName()
  {
    string myReturn = getName9(nativeNdx);
    return myReturn;
  }

}

}