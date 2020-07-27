package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueArrayFragment.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueArrayFragment extends RjniBaseClass
{


  protected RescueArrayFragment(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueArrayFragment()
  {
  }

  public int Dimensions()
  {
    int myReturn = Dimensions0(nativeNdx);
    return myReturn;
  }

  public long ILowBound64()
  {
    long myReturn = ILowBound1(nativeNdx);
    return myReturn;
  }

  public int ILowBound()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ILowBound64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ILowBound(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ILowBound64(), throwIfTooBig);
  }

  public long ICount64()
  {
    long myReturn = ICount2(nativeNdx);
    return myReturn;
  }

  public int ICount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ICount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ICount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ICount64(), throwIfTooBig);
  }

  public long JLowBound64()
  {
    long myReturn = JLowBound3(nativeNdx);
    return myReturn;
  }

  public int JLowBound()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(JLowBound64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int JLowBound(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(JLowBound64(), throwIfTooBig);
  }

  public long JCount64()
  {
    long myReturn = JCount4(nativeNdx);
    return myReturn;
  }

  public int JCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(JCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int JCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(JCount64(), throwIfTooBig);
  }

  public long KLowBound64()
  {
    long myReturn = KLowBound5(nativeNdx);
    return myReturn;
  }

  public int KLowBound()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(KLowBound64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int KLowBound(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(KLowBound64(), throwIfTooBig);
  }

  public long KCount64()
  {
    long myReturn = KCount6(nativeNdx);
    return myReturn;
  }

  public int KCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(KCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int KCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(KCount64(), throwIfTooBig);
  }

  public long NodeCount64()
  {
    long myReturn = NodeCount7(nativeNdx);
    return myReturn;
  }

  public int NodeCount()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(NodeCount64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int NodeCount(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(NodeCount64(), throwIfTooBig);
  }

  public void dispose()
  {
    Delete_RescueArrayFragment(nativeNdx);
  }

  private native int Dimensions0(long refNdx);
  private native long ILowBound1(long refNdx);
  private native long ICount2(long refNdx);
  private native long JLowBound3(long refNdx);
  private native long JCount4(long refNdx);
  private native long KLowBound5(long refNdx);
  private native long KCount6(long refNdx);
  private native long NodeCount7(long refNdx);
  private native void Delete_RescueArrayFragment(long ndx);
}
