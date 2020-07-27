package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueTruncation.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueTruncation extends RjniBaseClass
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

  public int I(boolean throwIfTooBig) throws RuntimeException
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

  public int J(boolean throwIfTooBig) throws RuntimeException
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

  public int SelfFaultId(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(SelfFaultId64(), throwIfTooBig);
  }

  public float SelfLimit()
  {
    float myReturn = SelfLimit8(nativeNdx);
    return myReturn;
  }

  public boolean isSelfTruncating()
  {
    boolean myReturn = isSelfTruncating10(nativeNdx);
    return myReturn;
  }

  private native long Create_RescueTruncation0();
  private native void SetI1(long refNdx
                           ,long iIn);
  private native void SetJ2(long refNdx
                           ,long jIn);
  private native void SetSelfFaultId3(long refNdx
                                     ,long self_fault_idIn);
  private native void SetSelfLimit4(long refNdx
                                   ,float self_limitIn);
  private native long I5(long refNdx);
  private native long J6(long refNdx);
  private native long SelfFaultId7(long refNdx);
  private native float SelfLimit8(long refNdx);
  private native boolean isSelfTruncating10(long refNdx);
}
