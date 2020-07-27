using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueVersionRule : RescueRule
{


  protected RescueVersionRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueVersionRule()
  {
  }

  public void dispose()
  {
    Delete_RescueVersionRule(nativeNdx);
  }

  public void print(RescueReporter reporter)
  {
    print3(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public int apply(RescueClassificationContext context)
  {
    int myReturn = apply4(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx);
    return myReturn;
  }

  public int version()
  {
    int myReturn = version5(nativeNdx);
    return myReturn;
  }

  public bool Equals(RescueRule example)
  {
    bool myReturn = Equals6(nativeNdx
                                 ,(example == null) ? 0 : example.nativeNdx);
    return myReturn;
  }

}

}