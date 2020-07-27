using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBUHRule : RescueRule
{


  protected RescueBUHRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBUHRule()
  {
    nativeNdx = Create_RescueBUHRule0();
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