using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueCoordinatePolyLine : RescueGeometryObject
{


  protected RescueCoordinatePolyLine(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueCoordinatePolyLine(nativeNdx);
  }

}

}