using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueWireframeStub : RescueObject
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

  public int WireframeId(bool throwIfTooBig) //thro RuntimeException
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

  public int ObjectId(bool throwIfTooBig) //thro RuntimeException
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

  public int BestIdentifier(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(BestIdentifier64(), throwIfTooBig);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}