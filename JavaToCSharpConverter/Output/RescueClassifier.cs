using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueClassifier : org.Rescue.rjni.RjniBaseClass
{


  protected RescueClassifier(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueClassifier(RescueFlavourFactory[] addonFactories,
                          bool ignoreStandards)
  {
    nativeNdx = Create_RescueClassifier0(addonFactories,
                                         ignoreStandards);
  }

  public void dispose()
  {
    Delete_RescueClassifier(nativeNdx);
  }

  public int apply(RescueClassificationContext context,
                      bool doAll)
  {
    int myReturn = apply2(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx
                            ,doAll);
    return myReturn;
  }

  public bool IsFlavour(RescueClassificationContext context,
                              string flavourName,
                              cSetString failedRuleNames)
  {
    bool myReturn = IsFlavour3(nativeNdx
                                    ,(context == null) ? 0 : context.nativeNdx
                                    ,flavourName
                                    ,(failedRuleNames == null) ? 0 : failedRuleNames.nativeNdx);
    return myReturn;
  }

  public RescueFlavour FlavourNamed(string name)
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

}

}