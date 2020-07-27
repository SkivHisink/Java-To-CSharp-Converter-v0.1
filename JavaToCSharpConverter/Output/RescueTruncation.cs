using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueTruncation : RjniBaseClass
{


  protected RescueTruncation(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueTruncation()
  {
    nativeNdx = Create_RescueTruncation0();
  }

  public void SetI(long iIn)
  {
    SetI1(nativeNdx
         ,iIn);
  }

  public void SetJ(long jIn)
  {
    SetJ2(nativeNdx
         ,jIn);
  }

  public void SetSelfFaultId(long self_fault_idIn)
  {
    SetSelfFaultId3(nativeNdx
                   ,self_fault_idIn);
  }

  public void SetSelfLimit(float self_limitIn)
  {
    SetSelfLimit4(nativeNdx
                 ,self_limitIn);
  }

  public long I64()
  {
    long myReturn = I5(nativeNdx);
    return myReturn;
  }

  public int I()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(I64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int I(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(I64(), throwIfTooBig);
  }

  public long J64()
  {
    long myReturn = J6(nativeNdx);
    return myReturn;
  }

  public int J()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(J64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int J(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(J64(), throwIfTooBig);
  }

  public long SelfFaultId64()
  {
    long myReturn = SelfFaultId7(nativeNdx);
    return myReturn;
  }

  public int SelfFaultId()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(SelfFaultId64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int SelfFaultId(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(SelfFaultId64(), throwIfTooBig);
  }

  public float SelfLimit()
  {
    float myReturn = SelfLimit8(nativeNdx);
    return myReturn;
  }

  public bool isSelfTruncating()
  {
    bool myReturn = isSelfTruncating10(nativeNdx);
    return myReturn;
  }

}

}