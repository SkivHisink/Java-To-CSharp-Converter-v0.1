using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueClassificationContext : org.Rescue.rjni.RjniBaseClass
{


  protected RescueClassificationContext(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueClassificationContext(RescueModel model,
                                     string path,
                                     RescueReporter reporter)
  {
    nativeNdx = Create_RescueClassificationContext0((model == null) ? 0 : model.nativeNdx,
                                                    path,
                                                    (reporter == null) ? 0 : reporter.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueClassificationContext(nativeNdx);
  }

  public RescueModel model()
  {
    long returnNdx = model2(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public string path()
  {
    string myReturn = path3(nativeNdx);
    return myReturn;
  }

  public RescueReporter reporter()
  {
    long returnNdx = reporter4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueReporter myReturn = new RescueReporter(returnNdx);
      String className = myReturn.ClassName();
      if (className.equals("class RescueStreamReporter"))
      {
        myReturn = new RescueStreamReporter(returnNdx);
      }
      return myReturn;
    }
  }

  public RescueClassificationResult[] appliedRules()
  {
    RescueClassificationResult[] myReturn = appliedRules5(nativeNdx);
    return myReturn;
  }

  public void registerAppliedRule(RescueClassificationResult result)
  {
    registerAppliedRule6(nativeNdx
                        ,(result == null) ? 0 : result.nativeNdx);
  }

  public void reset()
  {
    reset7(nativeNdx);
  }

  public RescueClassificationResult PreviouslyApplied(RescueRule exampleRule)
  {
    long returnNdx = PreviouslyApplied8(nativeNdx
                                        ,(exampleRule == null) ? 0 : exampleRule.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueClassificationResult myReturn = new RescueClassificationResult(returnNdx);
      return myReturn;
    }
  }

}

}