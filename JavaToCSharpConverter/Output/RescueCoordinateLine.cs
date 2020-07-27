using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueCoordinateLine : RescueGeometryObject
{


  protected RescueCoordinateLine(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueCoordinateLine(nativeNdx);
  }

}

}