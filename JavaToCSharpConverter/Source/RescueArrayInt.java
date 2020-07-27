package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayInt.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayInt extends RescueArray
{


  protected RescueArrayInt(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayInt(nativeNdx);
  }

  public int NullValue()
  {
    int myReturn = NullValue1(nativeNdx);
    return myReturn;
  }

  public int[] Value()
  {
    int[] myReturn = Value2(nativeNdx);
    return myReturn;
  }

  public int[] DemandValue()
  {
    if (IsLoaded() == false)
	{
	  Load();
	}
	return Value();
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

  public void AllValues(int[] buffer,
                        long offset,
                        long valueCount)
  {
    AllValues4(nativeNdx
              ,buffer
              ,offset
              ,valueCount);
  }

  public void AllValues(int[] buffer,
                        int offset,
                        int valueCount)
  {
    AllValues4(nativeNdx
              ,buffer
              ,(long) offset
              ,(long) valueCount);
  }

  public void SetValue(int nullValue,
                       int[] valueArray)
  {
    SetValue5(nativeNdx
             ,nullValue
             ,valueArray);
  }

  public void SetNullValue(int nullValueIn)
  {
    SetNullValue7(nativeNdx
                 ,nullValueIn);
  }

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded8(nativeNdx);
    return myReturn;
  }

  public int MinValue()
  {
    int myReturn = MinValue9(nativeNdx);
    return myReturn;
  }

  public int MaxValue()
  {
    int myReturn = MaxValue10(nativeNdx);
    return myReturn;
  }

  public RescueArrayFragment Load(long iLowBound,
                                    long iCount,
                                    long jLowBound,
                                    long jCount)
  {
    long returnNdx = Load11(nativeNdx
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
    long returnNdx = Load12(nativeNdx
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
    long returnNdx = Create13(nativeNdx
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
    long returnNdx = Create14(nativeNdx
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
    boolean myReturn = IsOfType15(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueArrayInt(long ndx);
  private native int NullValue1(long refNdx);
  private native int[] Value2(long refNdx);
  private native long ValueLength3(long refNdx);
  private native void AllValues4(long refNdx
                                ,int[] buffer
                                ,long offset
                                ,long valueCount);
  private native void SetValue5(long refNdx
                               ,int nullValue
                               ,int[] valueArray);
  private native void SetNullValue7(long refNdx
                                   ,int nullValueIn);
  private native boolean IsLoaded8(long refNdx);
  private native int MinValue9(long refNdx);
  private native int MaxValue10(long refNdx);
  private native long Load11(long refNdx
                             ,long iLowBound
                             ,long iCount
                             ,long jLowBound
                             ,long jCount);
  private native long Load12(long refNdx
                             ,long iLowBound
                             ,long iCount
                             ,long jLowBound
                             ,long jCount
                             ,long kLowBound
                             ,long kCount);
  private native long Create13(long refNdx
                               ,long iLowBound
                               ,long iCount
                               ,long jLowBound
                               ,long jCount);
  private native long Create14(long refNdx
                               ,long iLowBound
                               ,long iCount
                               ,long jLowBound
                               ,long jCount
                               ,long kLowBound
                               ,long kCount);
  private native boolean IsOfType15(long refNdx
                                   ,int thisType);
}
