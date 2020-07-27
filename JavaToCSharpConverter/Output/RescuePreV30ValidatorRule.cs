using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePreV30ValidatorRule : RescueVersionRule
{


  protected RescuePreV30ValidatorRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescuePreV30ValidatorRule()
  {
    nativeNdx = Create_RescuePreV30ValidatorRule0();
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

  public void toleranceFactor(double factor)
  {
    toleranceFactor3(nativeNdx
                    ,factor);
  }

  public double toleranceFactor()
  {
    double myReturn = toleranceFactor4(nativeNdx);
    return myReturn;
  }

}

}