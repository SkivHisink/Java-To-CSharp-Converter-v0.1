using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueArray3dVector : RescueArray
{


  protected RescueArray3dVector(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueArray3dVector(nativeNdx);
  }

  public Rescue3dVector NullValue()
  {
    Rescue3dVector myReturn = NullValue1(nativeNdx);
    return myReturn;
  }

  public Rescue3dVector[] Value()
  {
    Rescue3dVector[] myReturn = Value2(nativeNdx);
    return myReturn;
  }

  public Rescue3dVector[] DemandValue()
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

  public int ValueLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(ValueLength64(), throwIfTooBig);
  }

  public void AllValues(Rescue3dVector[] buffer,
                        long offset,
                        long valueCount)
  {
    AllValues4(nativeNdx
              ,buffer
              ,offset
              ,valueCount);
  }

  public void AllValues(Rescue3dVector[] buffer, int offset, int valueCount)
  {
    AllValues4(nativeNdx, buffer, (long) offset, (long) valueCount);
  }

  public void SetValue(Rescue3dVector nullValue,
                       Rescue3dVector[] valueArray)
  {
    SetValue5(nativeNdx
             ,nullValue
             ,valueArray);
  }

  public void SetNullValue(Rescue3dVector nullValueIn)
  {
    SetNullValue7(nativeNdx
                 ,nullValueIn);
  }

  public bool IsLoaded()
  {
    bool myReturn = IsLoaded8(nativeNdx);
    return myReturn;
  }

  public Rescue3dVector MinValue()
  {
    Rescue3dVector myReturn = MinValue9(nativeNdx);
    return myReturn;
  }

  public Rescue3dVector MaxValue()
  {
    Rescue3dVector myReturn = MaxValue10(nativeNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragment3dVector(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragment3dVector(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragment3dVector(returnNdx);
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
      RescueArrayFragment myReturn = new RescueArrayFragment3dVector(returnNdx);
      return myReturn;
    }
  }

  public RescueArrayFragment Create(int iLowBound, int iCount, int jLowBound, int jCount, int kLowBound, int kCount)
  {
    return Create((long) iLowBound, (long) iCount, (long) jLowBound, (long) jCount, (long) kLowBound, (long) kCount);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType15(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}