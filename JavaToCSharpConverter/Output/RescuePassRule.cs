using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescuePassRule : RescueRule
{


  protected RescuePassRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescuePassRule(bool pass)
  {
    nativeNdx = Create_RescuePassRule0(pass);
  }

  public RescuePassRule()
  {
    nativeNdx = Create_RescuePassRule1();
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

  public bool Equals(RescueRule example)
  {
    bool myReturn = Equals4(nativeNdx
                                 ,(example == null) ? 0 : example.nativeNdx);
    return myReturn;
  }

}

}