using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueHaveTipLoopRule : RescueRule
{


  protected RescueHaveTipLoopRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueHaveTipLoopRule()
  {
    nativeNdx = Create_RescueHaveTipLoopRule0();
  }

  public void print(RescueReporter reporter)
  {
    print1(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public int apply(RescueClassificationContext context)
  {
    int myReturn = apply2(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx);
    return myReturn;
  }

}

}