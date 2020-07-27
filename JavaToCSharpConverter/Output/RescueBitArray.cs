using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueBitArray : RescueObject
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

}

}