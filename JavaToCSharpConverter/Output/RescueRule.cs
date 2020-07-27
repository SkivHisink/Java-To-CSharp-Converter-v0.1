using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueRule : org.Rescue.rjni.RjniBaseClass
{


  protected RescueRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueRule()
  {
  }

  public int apply(RescueClassificationContext context)
  {
    int myReturn = apply0(nativeNdx
                            ,(context == null) ? 0 : context.nativeNdx);
    return myReturn;
  }

  public void print(RescueReporter reporter)
  {
    print1(nativeNdx
          ,(reporter == null) ? 0 : reporter.nativeNdx);
  }

  public bool Equals(RescueRule example)
  {
    bool myReturn = Equals2(nativeNdx
                                 ,(example == null) ? 0 : example.nativeNdx);
    return myReturn;
  }

  public string ClassName()
  {
    string myReturn = ClassName3(nativeNdx);
    return myReturn;
  }

}

}