package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RjniBaseClass.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RjniBaseClass
{
  public RjniBaseClass() 
  {
  }

  public boolean equals(RjniBaseClass other)
  {
    return (nativeNdx == other.nativeNdx);
  }

  public long getNativePeer()
  {
    return nativeNdx;
  }

  protected long nativeNdx;
}
