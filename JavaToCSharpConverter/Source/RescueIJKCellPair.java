package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueIJKCellPair.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueIJKCellPair
{
  public int i1;                   // The fault is recorded as a set of
  public int j1;                   // cell faces within the BUG that touch
  public int k1;                   // each other.  The area of their mutual
  public int face1;                // face is the surface.  
  public int lgrid1;               // 0 if primary geometry.  -1 if old model.
  public int i2;                   // face1 and face2 values are 
  public int j2;                   //            1 - positive I face,
  public int k2;                   //            2 - positive J face,
  public int face2;                //            3 - positive K face,
                                   //           -1 - negative I face,
                                   //           -2 - negative J face,
                                   //           -3 - negative K face.
                                   //            0 - old model or face not given.
  public int lgrid2;               // 0 if primary geometry.  -1 if old model.
}

