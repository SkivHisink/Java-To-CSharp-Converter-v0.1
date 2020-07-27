package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescueArrayFragment.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescueArrayFragment extends RjniBaseClass
{


  protected cSetRescueArrayFragment(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueArrayFragment()
  {
    nativeNdx = Create_cSetRescueArrayFragment0();
  }

  public void dispose()
  {
    Delete_cSetRescueArrayFragment(nativeNdx);
  }

  public void AddTo(RescueArrayFragment newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueArrayFragment existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public boolean RemoveFrom(long ndx)
  {
    boolean myReturn = RemoveFrom4(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public boolean RemoveFrom(int ndx)
  {
    return RemoveFrom((long) ndx);
  }

  public RescueArrayFragment NthObject(long ordinal)
  {
    long[] returnNdx = NthObject5x(nativeNdx
                                ,ordinal);
    if (returnNdx == null)
    {
      return null;
    }
    else
    {
	  RescueArrayFragment myReturn = null;
	  switch ((int) returnNdx[1])
	  {
	  case RescueObject.R_RescueArrayDouble:
	    myReturn = new RescueArrayFragmentDouble(returnNdx[0]);
	    break;
	  case RescueObject.R_RescueArrayByte:
	    myReturn = new RescueArrayFragmentByte(returnNdx[0]);
		break;
	  case RescueObject.R_RescueArrayShort:
	    myReturn = new RescueArrayFragmentShort(returnNdx[0]);
		break;
	  case RescueObject.R_RescueArrayFloat:
	    myReturn = new RescueArrayFragmentFloat(returnNdx[0]);
		break;
	  case RescueObject.R_RescueArray2dVector:
	    myReturn = new RescueArrayFragment2dVector(returnNdx[0]);
		break;
	  case RescueObject.R_RescueArray3dVector:
	    myReturn = new RescueArrayFragment3dVector(returnNdx[0]);
		break;
	  case RescueObject.R_RescueArrayInt:
	    myReturn = new RescueArrayFragmentInt(returnNdx[0]);
		break;
	  }
      return myReturn;
    }
  }

  public RescueArrayFragment NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
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

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  public void EmptySelf()
  {
    EmptySelf7(nativeNdx);
  }

  private native long Create_cSetRescueArrayFragment0();
  private native void Delete_cSetRescueArrayFragment(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native boolean RemoveFrom4(long refNdx
                                    ,long ndx);
  private native long[] NthObject5x(long refNdx
                                 ,long ordinal);
  private native long Count6(long refNdx);
  private native void EmptySelf7(long refNdx);
}
