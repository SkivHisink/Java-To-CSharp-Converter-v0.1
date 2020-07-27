using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueZStack : RescueGeometryObject
{


  protected RescueZStack(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueZStack(nativeNdx);
  }

}

}