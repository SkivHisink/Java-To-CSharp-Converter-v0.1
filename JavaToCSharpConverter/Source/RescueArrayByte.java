package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayByte.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayByte extends RescueArray
{


  protected RescueArrayByte(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayByte(nativeNdx);
  }

  public int NullValue()
  {
    int myReturn = NullValue1(nativeNdx);
    return myReturn;
  }

  public RescueLookup LookupTable()
  {
    long returnNdx = LookupTable2(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLookup myReturn = new RescueLookup(returnNdx);
      return myReturn;
    }
  }

  public long ValueLength64()
  {
    long myReturn = ValueLength3(nativeNdx);
    return myReturn;
  }

  public int ValueLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ValueLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ValueLength(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ValueLength64(), throwIfTooBig);
  }

  public byte[] Value()
  {
    byte[] myReturn = Value4(nativeNdx);
    return myReturn;
  }

  public byte[] DemandValue()
  {
    if (IsLoaded() == false)
	{
	  Load();
	}
	return Value();
  }

  public void AllValues(byte[] buffer,
                        long offset,
                        long valueCount)
  {
    AllValues5(nativeNdx
              ,buffer
              ,offset
              ,valueCount);
  }

  public void AllValues(byte[] buffer, int offset, int valueCount)
  {
    AllValues5(nativeNdx, buffer, (long) offset, (long) valueCount);
  }

  public void SetValue(byte nullValue,
                       byte[] valueArray)
  {
    SetValue6(nativeNdx
             ,nullValue
             ,valueArray);
  }

  public void SetNullValue(char nullValueIn)
  {
    SetNullValue8(nativeNdx
                 ,nullValueIn);
  }

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded9(nativeNdx);
    return myReturn;
  }

  public byte MinValue()
  {
    byte myReturn = MinValue10(nativeNdx);
    return myReturn;
  }

  public byte MaxValue()
  {
    byte myReturn = MaxValue11(nativeNdx);
    return myReturn;
  }

  public RescueArrayFragment Load(long iLowBound,
                                    long iCount,
                                    long jLowBound,
                                    long jCount)
  {
    long returnNdx = Load12(nativeNdx
                           ,iLowBound
                           ,iCount
                           ,jLowBound
                           ,jCount);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueArrayFragment myReturn = new RescueArrayFragmentByte(returnNdx);
      return myReturn;
    }
  }

  public RescueArrayFragment Load(int iLowBound, int iCount, int jLowBound, int jCount)
  {
    return Load((long) iLowBound, (long) iCount, (long) jLowBound, (long) jCount);
  }

  public RescueArrayFragment Load(long iLowBound,
                                    long iCount,
                                    long jLowBound,
                                    long jCount,
                                    long kLowBound,
                                    long kCount)
  {
    long returnNdx = Load13(nativeNdx
                           ,iLowBound
                           ,iCount
                           ,jLowBound
                           ,jCount
                           ,kLowBound
                           ,kCount);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueArrayFragment myReturn = new RescueArrayFragmentByte(returnNdx);
      return myReturn;
    }
  }

  public RescueArrayFragment Load(int iLowBound, int iCount, int jLowBound, int jCount, int kLowBound, int kCount)
  {
    return Load((long) iLowBound, (long) iCount, (long) jLowBound, (long) jCount, (long) kLowBound, (long) kCount);
  }

  public RescueArrayFragment Create(long iLowBound,
                                      long iCount,
                                      long jLowBound,
                                      long jCount)
  {
    long returnNdx = Create14(nativeNdx
                             ,iLowBound
                             ,iCount
                             ,jLowBound
                             ,jCount);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueArrayFragment myReturn = new RescueArrayFragmentByte(returnNdx);
      return myReturn;
    }
  }

  public RescueArrayFragment Create(int iLowBound, int iCount, int jLowBound, int jCount)
  {
    return Create((long) iLowBound, (long) iCount, (long) jLowBound, (long) jCount);
  }

  public RescueArrayFragment Create(long iLowBound,
                                      long iCount,
                                      long jLowBound,
                                      long jCount,
                                      long kLowBound,
                                      long kCount)
  {
    long returnNdx = Create15(nativeNdx
                             ,iLowBound
                             ,iCount
                             ,jLowBound
                             ,jCount
                             ,kLowBound
                             ,kCount);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueArrayFragment myReturn = new RescueArrayFragmentByte(returnNdx);
      return myReturn;
    }
  }

  public RescueArrayFragment Create(int iLowBound, int iCount, int jLowBound, int jCount, int kLowBound, int kCount)
  {
    return Create((long) iLowBound, (long) iCount, (long) jLowBound, (long) jCount, (long) kLowBound, (long) kCount);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType16(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueArrayByte(long ndx);
  private native int NullValue1(long refNdx);
  private native long LookupTable2(long refNdx);
  private native long ValueLength3(long refNdx);
  private native byte[] Value4(long refNdx);
  private native void AllValues5(long refNdx
                                ,byte[] buffer
                                ,long offset
                                ,long valueCount);
  private native void SetValue6(long refNdx
                               ,byte nullValue
                               ,byte[] valueArray);
  private native void SetNullValue8(long refNdx
                                   ,char nullValueIn);
  private native boolean IsLoaded9(long refNdx);
  private native byte MinValue10(long refNdx);
  private native byte MaxValue11(long refNdx);
  private native long Load12(long refNdx
                             ,long iLowBound
                             ,long iCount
                             ,long jLowBound
                             ,long jCount);
  private native long Load13(long refNdx
                             ,long iLowBound
                             ,long iCount
                             ,long jLowBound
                             ,long jCount
                             ,long kLowBound
                             ,long kCount);
  private native long Create14(long refNdx
                               ,long iLowBound
                               ,long iCount
                               ,long jLowBound
                               ,long jCount);
  private native long Create15(long refNdx
                               ,long iLowBound
                               ,long iCount
                               ,long jLowBound
                               ,long jCount
                               ,long kLowBound
                               ,long kCount);
  private native boolean IsOfType16(long refNdx
                                   ,int thisType);
}
