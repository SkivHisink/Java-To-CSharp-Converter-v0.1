using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueSplitLine : RescueGeometryObject
{


  protected RescueSplitLine(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueSplitLine(nativeNdx);
  }

}

}