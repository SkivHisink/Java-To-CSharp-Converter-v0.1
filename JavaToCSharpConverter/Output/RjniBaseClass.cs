using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RjniBaseClass
{
  public RjniBaseClass() 
  {
  }

  public bool equals(RjniBaseClass other)
  {
    return (nativeNdx == other.nativeNdx);
  }

  public long getNativePeer()
  {
    return nativeNdx;
  }

  protected long nativeNdx;
}

}