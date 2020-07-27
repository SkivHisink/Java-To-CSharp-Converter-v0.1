package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueClassificationContext.java

    Rod Hanks   Aug 25 2005

******************************************************************/
public class RescueClassificationContext extends org.Rescue.rjni.RjniBaseClass
{


  protected RescueClassificationContext(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueClassificationContext(RescueModel model,
                                     java.lang.String path,
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

  public java.lang.String path()
  {
    java.lang.String myReturn = path3(nativeNdx);
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

  private native long Create_RescueClassificationContext0(long model,
                                                         java.lang.String path,
                                                         long reporter);
  private native void Delete_RescueClassificationContext(long ndx);
  private native long model2(long refNdx);
  private native java.lang.String path3(long refNdx);
  private native long reporter4(long refNdx);
  private native RescueClassificationResult[] appliedRules5(long refNdx);
  private native void registerAppliedRule6(long refNdx
                                          ,long result);
  private native void reset7(long refNdx);
  private native long PreviouslyApplied8(long refNdx
                                         ,long exampleRule);
}
