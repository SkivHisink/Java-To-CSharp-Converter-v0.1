using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueGridAxis : RescueObject
{

  public static final int I_AXIS = 0;
  public static final int J_AXIS = 1;
  public static final int K_AXIS = 2;
  public static final int UNKNOWN = 3;

  protected RescueGridAxis(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGrid ParentGrid()
  {
    long returnNdx = ParentGrid0(nativeNdx);
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

  public long LowBound64()
  {
    long myReturn = LowBound1(nativeNdx);
    return myReturn;
  }

  public int LowBound()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(LowBound64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int LowBound(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(LowBound64(), throwIfTooBig);
  }

  public long Count64()
  {
    long myReturn = Count2(nativeNdx);
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

  public bool IsRegular()
  {
    bool myReturn = IsRegular3(nativeNdx);
    return myReturn;
  }

  public RescueCoordinateSystemAxis RelatedCoordinateSystemAxis()
  {
    long returnNdx = RelatedCoordinateSystemAxis4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystemAxis myReturn = new RescueCoordinateSystemAxis(returnNdx);
      return myReturn;
    }
  }

  public float ValueAt(long ndx)
  {
    float myReturn = ValueAt5(nativeNdx
                             ,ndx);
    return myReturn;
  }

  public float Origin()
  {
    float myReturn = Origin6(nativeNdx);
    return myReturn;
  }

  public float Step()
  {
    float myReturn = Step7(nativeNdx);
    return myReturn;
  }

  public void SetOrigin(float originIn)
  {
    SetOrigin8(nativeNdx
              ,originIn);
  }

  public void SetStep(float stepIn)
  {
    SetStep9(nativeNdx
            ,stepIn);
  }

  public int AxisIndex()
  {
    int myReturn = AxisIndex10(nativeNdx);
    return myReturn;
  }

  public RescueGridAxis(RescueContext context, long lowbound, long count, float origin, float step)
  {
    nativeNdx = Create_RescueGridAxis1((context == null) ? 0 : context.nativeNdx,
										lowbound, count, origin, step);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType11(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}