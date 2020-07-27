using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueSplitNodesRule : RescueRule
{


  protected RescueSplitNodesRule(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueSplitNodesRule(bool wantSplitsIn)
  {
    nativeNdx = Create_RescueSplitNodesRule0(wantSplitsIn);
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

  public bool Equals(RescueRule example)
  {
    bool myReturn = Equals3(nativeNdx
                                 ,(example == null) ? 0 : example.nativeNdx);
    return myReturn;
  }

}

}