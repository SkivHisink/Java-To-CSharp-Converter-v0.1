using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueMultiBlockRule : RescueRule
{


  protected RescueMultiBlockRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueMultiBlockRule()
  {
    nativeNdx = Create_RescueMultiBlockRule0();
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