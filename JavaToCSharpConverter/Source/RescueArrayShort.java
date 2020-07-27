package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayShort.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayShort extends RescueArray
{


  protected RescueArrayShort(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayShort(nativeNdx);
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

  public char[] Value()
  {
    char[] myReturn = Value4(nativeNdx);
    return myReturn;
  }

  public char[] DemandValue()
  {
    if (IsLoaded() == false)
	{
	  Load();
	}
	return Value();
  }

  public void AllValues(char[] buffer,
                        long offset,
                        long valueCount)
  {
    AllValues5(nativeNdx
              ,buffer
              ,offset
              ,valueCount);
  }

  public void AllValues(char[] buffer,
                        int offset,
                        int valueCount)
  {
    AllValues5(nativeNdx
              ,buffer
              ,(long) offset
              ,(long) valueCount);
  }

  public void SetValue(char nullValue,
                       char[] valueArray)
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

  public char MinValue()
  {
    char myReturn = MinValue10(nativeNdx);
    return myReturn;
  }

  public char MaxValue()
  {
    char myReturn = MaxValue11(nativeNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragmentInt(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragmentInt(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragmentInt(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragmentInt(returnNdx);
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

  private native void Delete_RescueArrayShort(long ndx);
  private native int NullValue1(long refNdx);
  private native long LookupTable2(long refNdx);
  private native long ValueLength3(long refNdx);
  private native char[] Value4(long refNdx);
  private native void AllValues5(long refNdx
                                ,char[] buffer
                                ,long offset
                                ,long valueCount);
  private native void SetValue6(long refNdx
                               ,char nullValue
                               ,char[] valueArray);
  private native void SetNullValue8(long refNdx
                                   ,char nullValueIn);
  private native boolean IsLoaded9(long refNdx);
  private native char MinValue10(long refNdx);
  private native char MaxValue11(long refNdx);
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
