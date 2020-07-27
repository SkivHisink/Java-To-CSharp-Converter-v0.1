package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayDouble.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayDouble extends RescueArray
{


  protected RescueArrayDouble(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArrayDouble(nativeNdx);
  }

  public double NullValue()
  {
    double myReturn = NullValue1(nativeNdx);
    return myReturn;
  }

  public double[] Value()
  {
    double[] myReturn = Value2(nativeNdx);
    return myReturn;
  }

  public double[] DemandValue()
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

  public void AllValues(double[] buffer,
                        long offset,
                        long valueCount)
  {
    AllValues4(nativeNdx
              ,buffer
              ,offset
              ,valueCount);
  }

  public void AllValues(double[] buffer,
                        int offset,
                        int valueCount)
  {
    AllValues4(nativeNdx
              ,buffer
              ,(long) offset
              ,(long) valueCount);
  }

  public void SetValue(double nullValue,
                       double[] valueArray)
  {
    SetValue5(nativeNdx
             ,nullValue
             ,valueArray);
  }

  public boolean IsLoaded()
  {
    boolean myReturn = IsLoaded7(nativeNdx);
    return myReturn;
  }

  public double MinValue()
  {
    double myReturn = MinValue8(nativeNdx);
    return myReturn;
  }

  public double MaxValue()
  {
    double myReturn = MaxValue9(nativeNdx);
    return myReturn;
  }

  public RescueArrayFragment Load(long iLowBound,
                                    long iCount,
                                    long jLowBound,
                                    long jCount)
  {
    long returnNdx = Load10(nativeNdx
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
      RescueArrayFragment myReturn = new RescueArrayFragmentDouble(returnNdx);
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
    long returnNdx = Load11(nativeNdx
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
      RescueArrayFragment myReturn = new RescueArrayFragmentDouble(returnNdx);
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
    long returnNdx = Create12(nativeNdx
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
      RescueArrayFragment myReturn = new RescueArrayFragmentDouble(returnNdx);
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
    long returnNdx = Create13(nativeNdx
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
      RescueArrayFragment myReturn = new RescueArrayFragmentDouble(returnNdx);
      return myReturn;
    }
  }

  public RescueArrayFragment Create(int iLowBound, int iCount, int jLowBound, int jCount, int kLowBound, int kCount)
  {
    return Create((long) iLowBound, (long) iCount, (long) jLowBound, (long) jCount, (long) kLowBound, (long) kCount);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType14(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueArrayDouble(long ndx);
  private native double NullValue1(long refNdx);
  private native double[] Value2(long refNdx);
  private native long ValueLength3(long refNdx);
  private native void AllValues4(long refNdx
                                ,double[] buffer
                                ,long offset
                                ,long valueCount);
  private native void SetValue5(long refNdx
                               ,double nullValue
                               ,double[] valueArray);
  private native boolean IsLoaded7(long refNdx);
  private native double MinValue8(long refNdx);
  private native double MaxValue9(long refNdx);
  private native long Load10(long refNdx
                             ,long iLowBound
                             ,long iCount
                             ,long jLowBound
                             ,long jCount);
  private native long Load11(long refNdx
                             ,long iLowBound
                             ,long iCount
                             ,long jLowBound
                             ,long jCount
                             ,long kLowBound
                             ,long kCount);
  private native long Create12(long refNdx
                               ,long iLowBound
                               ,long iCount
                               ,long jLowBound
                               ,long jCount);
  private native long Create13(long refNdx
                               ,long iLowBound
                               ,long iCount
                               ,long jLowBound
                               ,long jCount
                               ,long kLowBound
                               ,long kCount);
  private native boolean IsOfType14(long refNdx
                                   ,int thisType);
}
