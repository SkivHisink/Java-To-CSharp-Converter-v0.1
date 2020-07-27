package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueBitArray.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueBitArray extends RescueObject
{


  protected RescueBitArray(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public int BitField(long zeroBasedNdx)
  {
    int myReturn = BitField0(nativeNdx
                            ,zeroBasedNdx);
    return myReturn;
  }

  public int BitField(int zeroBasedNdx)
  {
    return BitField((long) zeroBasedNdx);
  }

  public void SetBitField(long zeroBasedNdx,
                          int value)
  {
    SetBitField1(nativeNdx
                ,zeroBasedNdx
                ,value);
  }

  public void SetBitField(int zeroBasedNdx, int value)
  {
    SetBitField((long) zeroBasedNdx, value);
  }

  public void dispose()
  {
    Delete_RescueBitArray(nativeNdx);
  }

  private native int BitField0(long refNdx
                              ,long zeroBasedNdx);
  private native void SetBitField1(long refNdx
                                  ,long zeroBasedNdx
                                  ,int value);
  private native void Delete_RescueBitArray(long ndx);
}
