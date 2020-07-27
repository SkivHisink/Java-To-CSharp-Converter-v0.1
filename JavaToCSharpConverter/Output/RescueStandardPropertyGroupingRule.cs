using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueStandardPropertyGroupingRule : RescueRule
{


  protected RescueStandardPropertyGroupingRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueStandardPropertyGroupingRule()
  {
    nativeNdx = Create_RescueStandardPropertyGroupingRule0();
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