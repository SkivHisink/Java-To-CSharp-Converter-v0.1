using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBeforeVersionRule : RescueVersionRule
{


  protected RescueBeforeVersionRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueBeforeVersionRule(int version)
  {
    nativeNdx = Create_RescueBeforeVersionRule0(version);
  }

  public RescueBeforeVersionRule()
  {
    nativeNdx = Create_RescueBeforeVersionRule1();
  }

  public void print(RescueReporter reporter)
  {
    print2(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public int apply(RescueClassificationContext context)
  {
    int myReturn = apply3(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx);
    return myReturn;
  }

}

}