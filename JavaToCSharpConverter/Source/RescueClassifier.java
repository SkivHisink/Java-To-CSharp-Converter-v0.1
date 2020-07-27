package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueClassifier.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueClassifier extends org.Rescue.rjni.RjniBaseClass
{


  protected RescueClassifier(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueClassifier(RescueFlavourFactory[] addonFactories,
                          boolean ignoreStandards)
  {
    nativeNdx = Create_RescueClassifier0(addonFactories,
                                         ignoreStandards);
  }

  public void dispose()
  {
    Delete_RescueClassifier(nativeNdx);
  }

  public int apply(RescueClassificationContext context,
                      boolean doAll)
  {
    int myReturn = apply2(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx
                            ,doAll);
    return myReturn;
  }

  public boolean IsFlavour(RescueClassificationContext context,
                              java.lang.String flavourName,
                              cSetString failedRuleNames)
  {
    boolean myReturn = IsFlavour3(nativeNdx
                                    ,(context == null) ? 0 : context.nativeNdx
                                    ,flavourName
                                    ,(failedRuleNames == null) ? 0 : failedRuleNames.nativeNdx);
    return myReturn;
  }

  public RescueFlavour FlavourNamed(java.lang.String name)
  {
    long returnNdx = FlavourNamed4(nativeNdx
                                   ,name);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueFlavour myReturn = new RescueFlavour(returnNdx);
      return myReturn;
    }
  }

  public RescueFlavour[] Flavours()
  {
    RescueFlavour[] myReturn = Flavours5(nativeNdx);
    return myReturn;
  }

  private native long Create_RescueClassifier0(RescueFlavourFactory[] addonFactories,
                                              boolean ignoreStandards);
  private native void Delete_RescueClassifier(long ndx);
  private native int apply2(long refNdx
                           ,long context
                           ,boolean doAll);
  private native boolean IsFlavour3(long refNdx
                                   ,long context
                                   ,java.lang.String flavourName
                                   ,long failedRuleNames);
  private native long FlavourNamed4(long refNdx
                                    ,java.lang.String name);
  private native RescueFlavour[] Flavours5(long refNdx);
}
