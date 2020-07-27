package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueWireframeStub.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueWireframeStub extends RescueObject
{


  protected RescueWireframeStub(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueWireframeStub()
  {
  }

  public void dispose()
  {
    Delete_RescueWireframeStub(nativeNdx);
  }

  public long WireframeId64()
  {
    long myReturn = WireframeId1(nativeNdx);
    return myReturn;
  }

  public int WireframeId()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(WireframeId64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int WireframeId(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(WireframeId64(), throwIfTooBig);
  }

  public long ObjectId64()
  {
    long myReturn = ObjectId2(nativeNdx);
    return myReturn;
  }

  public int ObjectId()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(ObjectId64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int ObjectId(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(ObjectId64(), throwIfTooBig);
  }

  public RescueWireframe Wireframe(RescueModel model)
  {
    long returnNdx = Wireframe3(nativeNdx
                                ,(model == null) ? 0 : model.nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueWireframe myReturn = new RescueWireframe(returnNdx);
      return myReturn;
    }
  }

  public long BestIdentifier64()
  {
    long myReturn = BestIdentifier4(nativeNdx);
    return myReturn;
  }

  public int BestIdentifier()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(BestIdentifier64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int BestIdentifier(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(BestIdentifier64(), throwIfTooBig);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueWireframeStub(long ndx);
  private native long WireframeId1(long refNdx);
  private native long ObjectId2(long refNdx);
  private native long Wireframe3(long refNdx
                                 ,long model);
  private native long BestIdentifier4(long refNdx);
  private native boolean IsOfType5(long refNdx
                                  ,int thisType);
}
