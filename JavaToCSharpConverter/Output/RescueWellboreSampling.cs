using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueWellboreSampling : RescueObject
{


  protected RescueWellboreSampling(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueWellboreSampling(nativeNdx);
  }

  public RescueWellboreSampling(RescueWellbore parentWellbore,
                                long count,
                                float origin,
                                float step)
  {
    nativeNdx = Create_RescueWellboreSampling1((parentWellbore == null) ? 0 : parentWellbore.nativeNdx,
                                               count,
                                               origin,
                                               step);
  }

  public RescueWellboreSampling(RescueWellbore parentWellbore,
                                long count,
                                float[] values)
  {
    nativeNdx = Create_RescueWellboreSampling2((parentWellbore == null) ? 0 : parentWellbore.nativeNdx,
                                               count,
                                               values);
  }

  public RescueWellbore ParentWellbore()
  {
    long returnNdx = ParentWellbore3(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellbore myReturn = new RescueWellbore(returnNdx);
      return myReturn;
    }
  }

  public string TimeStamp()
  {
    string myReturn = TimeStamp4(nativeNdx);
    return myReturn;
  }

  public RescueGrid SampleGrid()
  {
    long returnNdx = SampleGrid5(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGrid myReturn = new RescueGrid(returnNdx);
      return myReturn;
    }
  }

  public long Count64()
  {
    long myReturn = Count6(nativeNdx);
    return myReturn;
  }

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Count(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public long WellborePropertyCount64()
  {
    long myReturn = WellborePropertyCount7(nativeNdx);
    return myReturn;
  }

  public int WellborePropertyCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WellborePropertyCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int WellborePropertyCount(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(WellborePropertyCount64(), throwIfTooBig);
  }

  public RescueWellboreProperty NthRescueWellboreProperty(long zeroBasedOrdinal)
  {
    long returnNdx = NthRescueWellboreProperty8(nativeNdx
                                                ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreProperty myReturn = new RescueWellboreProperty(returnNdx);
      return myReturn;
    }
  }

  public RescueWellboreProperty PropertyDescribedBy(string name
                                                   ,string type
												   ,string uom)
  {
    long returnNdx = PropertyDescribedBy14(nativeNdx, name, type, uom);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWellboreProperty myReturn = new RescueWellboreProperty(returnNdx);
      return myReturn;
    }
  }

  public bool DropRescueWellboreProperty(RescueWellboreProperty unitToDrop)
  {
    bool myReturn = DropRescueWellboreProperty9(nativeNdx
                                                     ,(unitToDrop == null) ? 0 : unitToDrop.nativeNdx);
    return myReturn;
  }

  public float MeasuredDepthAt(long ndx)
  {
    float myReturn = MeasuredDepthAt10(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public bool AnyFileTruncated()
  {
    bool myReturn = AnyFileTruncated11(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType12(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void SetValues(float[] valueArray)
  {
    SetValues13(nativeNdx
               ,valueArray);
  }


}

}