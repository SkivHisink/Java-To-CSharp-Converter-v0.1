package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArray2dVector.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArray2dVector extends RescueArray
{


  protected RescueArray2dVector(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArray2dVector(nativeNdx);
  }

  public Rescue2dVector NullValue()
  {
    Rescue2dVector myReturn = NullValue1(nativeNdx);
    return myReturn;
  }

  public Rescue2dVector[] Value()
  {
    Rescue2dVector[] myReturn = Value2(nativeNdx);
    return myReturn;
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

  public void AllValues(Rescue2dVector[] buffer,
                        long offset,
                        long valueCount)
  {
    AllValues4(nativeNdx
              ,buffer
              ,offset
              ,valueCount);
  }

  public void AllValues(Rescue2dVector[] buffer, int offset, int valueCount)
  {
    AllValues4(nativeNdx, buffer, (long) offset, (long) valueCount);
  }

  public void SetValue(Rescue2dVector nullValue,
                       Rescue2dVector[] valueArray)
  {
    SetValue5(nativeNdx
             ,nullValue
             ,valueArray);
  }

  public void SetNullValue(Rescue2dVector nullValueIn)
  {
    SetNullValue7(nativeNdx
                 ,nullValueIn);
  }

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded8(nativeNdx);
    return myReturn;
  }

  public Rescue2dVector MinValue()
  {
    Rescue2dVector myReturn = MinValue9(nativeNdx);
    return myReturn;
  }

  public Rescue2dVector MaxValue()
  {
    Rescue2dVector myReturn = MaxValue10(nativeNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragment2dVector(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragment2dVector(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragment2dVector(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragment2dVector(returnNdx);
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

  private native void Delete_RescueArray2dVector(long ndx);
  private native Rescue2dVector NullValue1(long refNdx);
  private native Rescue2dVector[] Value2(long refNdx);
  private native long ValueLength3(long refNdx);
  private native void AllValues4(long refNdx
                                ,Rescue2dVector[] buffer
                                ,long offset
                                ,long valueCount);
  private native void SetValue5(long refNdx
                               ,Rescue2dVector nullValue
                               ,Rescue2dVector[] valueArray);
  private native void SetNullValue7(long refNdx
                                   ,Rescue2dVector nullValueIn);
  private native boolean IsLoaded8(long refNdx);
  private native Rescue2dVector MinValue9(long refNdx);
  private native Rescue2dVector MaxValue10(long refNdx);
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
