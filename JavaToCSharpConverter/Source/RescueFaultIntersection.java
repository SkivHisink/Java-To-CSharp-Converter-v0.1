package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueFaultIntersection.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueFaultIntersection extends RescueHistoryObject
{


  protected RescueFaultIntersection(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueFaultIntersection(nativeNdx);
  }

  public RescueFaultIntersection(RescueModel model,
                                 RescueSection majorSection,
                                 RescueSection minorSection)
  {
    nativeNdx = Create_RescueFaultIntersection1((model == null) ? 0 : model.nativeNdx,
                                                (majorSection == null) ? 0 : majorSection.nativeNdx,
                                                (minorSection == null) ? 0 : minorSection.nativeNdx);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel2(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public RescueSection MajorSection()
  {
    long returnNdx = MajorSection3(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSection myReturn = new RescueSection(returnNdx);
      return myReturn;
    }
  }

  public RescueSection MinorSection()
  {
    long returnNdx = MinorSection4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueSection myReturn = new RescueSection(returnNdx);
      return myReturn;
    }
  }

  public void SetMajorSection(RescueSection newMajorSection)
  {
    SetMajorSection5(nativeNdx
                    ,(newMajorSection == null) ? 0 : newMajorSection.nativeNdx);
  }

  public void SetMinorSection(RescueSection newMinorSection)
  {
    SetMinorSection6(nativeNdx
                    ,(newMinorSection == null) ? 0 : newMinorSection.nativeNdx);
  }

  public RescueEdgeSetStub EdgesObj()
  {
    long returnNdx = EdgesObj7(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSetStub myReturn = new RescueEdgeSetStub(returnNdx);
      return myReturn;
    }
  }

  public RescueEdgeSet Edges()
  {
    long returnNdx = Edges8(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueEdgeSet myReturn = new RescueEdgeSet(returnNdx);
      return myReturn;
    }
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native void Delete_RescueFaultIntersection(long ndx);
  private native long Create_RescueFaultIntersection1(long model,
                                                     long majorSection,
                                                     long minorSection);
  private native long ParentModel2(long refNdx);
  private native long MajorSection3(long refNdx);
  private native long MinorSection4(long refNdx);
  private native void SetMajorSection5(long refNdx
                                      ,long newMajorSection);
  private native void SetMinorSection6(long refNdx
                                      ,long newMinorSection);
  private native long EdgesObj7(long refNdx);
  private native long Edges8(long refNdx);
  private native boolean IsOfType9(long refNdx
                                  ,int thisType);
}
