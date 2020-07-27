using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueSplitPoint : RjniBaseClass
{


  protected RescueSplitPoint(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueSplitPoint(nativeNdx);
  }

}

}