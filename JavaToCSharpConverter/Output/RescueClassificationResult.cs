using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueClassificationResult : org.Rescue.rjni.RjniBaseClass
{


  protected RescueClassificationResult(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueClassificationResult(RescueRule rule,
                                    int result)
  {
    nativeNdx = Create_RescueClassificationResult0((rule == null) ? 0 : rule.nativeNdx,
                                                   result);
  }

}

}