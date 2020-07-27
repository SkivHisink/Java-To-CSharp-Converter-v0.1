using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueAndUpVersionRule : RescueVersionRule
{


  protected RescueAndUpVersionRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueAndUpVersionRule(int version)
  {
    nativeNdx = Create_RescueAndUpVersionRule0(version);
  }

  public RescueAndUpVersionRule()
  {
    nativeNdx = Create_RescueAndUpVersionRule1();
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