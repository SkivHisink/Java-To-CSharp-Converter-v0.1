/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_Rescue_rjni_RescueParametricLGRMap */

#ifndef _Included_org_Rescue_rjni_RescueParametricLGRMap
#define _Included_org_Rescue_rjni_RescueParametricLGRMap
#ifdef __cplusplus
extern "C" {
#endif
#undef org_Rescue_rjni_RescueParametricLGRMap_LGR_I_NDX
#define org_Rescue_rjni_RescueParametricLGRMap_LGR_I_NDX 0L
#undef org_Rescue_rjni_RescueParametricLGRMap_LGR_J_NDX
#define org_Rescue_rjni_RescueParametricLGRMap_LGR_J_NDX 1L
#undef org_Rescue_rjni_RescueParametricLGRMap_LGR_K_NDX
#define org_Rescue_rjni_RescueParametricLGRMap_LGR_K_NDX 2L
#undef org_Rescue_rjni_RescueParametricLGRMap_PARENT_NDX
#define org_Rescue_rjni_RescueParametricLGRMap_PARENT_NDX 3L
#undef org_Rescue_rjni_RescueParametricLGRMap_PARENT_COUNT
#define org_Rescue_rjni_RescueParametricLGRMap_PARENT_COUNT 4L
#undef org_Rescue_rjni_RescueParametricLGRMap_PARENT_I_NDX
#define org_Rescue_rjni_RescueParametricLGRMap_PARENT_I_NDX 5L
#undef org_Rescue_rjni_RescueParametricLGRMap_PARENT_J_NDX
#define org_Rescue_rjni_RescueParametricLGRMap_PARENT_J_NDX 6L
#undef org_Rescue_rjni_RescueParametricLGRMap_PARENT_K_NDX
#define org_Rescue_rjni_RescueParametricLGRMap_PARENT_K_NDX 7L
#undef org_Rescue_rjni_RescueParametricLGRMap_LGR_NDX
#define org_Rescue_rjni_RescueParametricLGRMap_LGR_NDX 8L
/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    Create_RescueParametricLGRMap0
 * Signature: (JJJJJ)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_Create_1RescueParametricLGRMap0
  (JNIEnv *, jobject, jlong, jlong, jlong, jlong, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    Delete_RescueParametricLGRMap
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_Delete_1RescueParametricLGRMap
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ClearMap2
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ClearMap2
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    SetCellToCell3
 * Signature: (JJJJJ[J[J[J)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_SetCellToCell3
  (JNIEnv *, jobject, jlong, jlong, jlong, jlong, jlong, jlongArray, jlongArray, jlongArray);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    SetCellToCell3i
 * Signature: (JIIII[I[I[I)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_SetCellToCell3i
  (JNIEnv *, jobject, jlong, jint, jint, jint, jint, jintArray, jintArray, jintArray);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ReadLGRCellToCell4
 * Signature: (JJJJJ[J[J[J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ReadLGRCellToCell4
  (JNIEnv *, jobject, jlong, jlong, jlong, jlong, jlong, jlongArray, jlongArray, jlongArray);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ReadLGRCellToCell4i
 * Signature: (JIIII[I[I[I)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ReadLGRCellToCell4i
  (JNIEnv *, jobject, jlong, jint, jint, jint, jint, jintArray, jintArray, jintArray);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ReadParentCellToCell5
 * Signature: (JJJJJ[J[J[J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ReadParentCellToCell5
  (JNIEnv *, jobject, jlong, jlong, jlong, jlong, jlong, jlongArray, jlongArray, jlongArray);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ReadParentCellToCell5i
 * Signature: (JIIII[I[I[I)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ReadParentCellToCell5i
  (JNIEnv *, jobject, jlong, jint, jint, jint, jint, jintArray, jintArray, jintArray);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    CellToCellMapCount6
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_CellToCellMapCount6
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    LGRIndx7
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_LGRIndx7
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    LGRIndx7i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_LGRIndx7i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    LGRJndx8
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_LGRJndx8
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    LGRJndx8i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_LGRJndx8i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    LGRKndx9
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_LGRKndx9
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    LGRKndx9i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_LGRKndx9i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentNdx10
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentNdx10
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentNdx10i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentNdx10i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentCount11
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentCount11
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentCount11i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentCount11i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentMapCount12
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentMapCount12
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentINdx13
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentINdx13
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentINdx13i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentINdx13i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentJNdx14
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentJNdx14
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentJNdx14i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentJNdx14i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentKNdx15
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentKNdx15
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    ParentKNdx15i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_ParentKNdx15i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    LGRNdx16
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_LGRNdx16
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    LGRNdx16i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_LGRNdx16i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    CopyArray17
 * Signature: (JIJJ[JJ)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_CopyArray17
  (JNIEnv *, jobject, jlong, jint, jlong, jlong, jlongArray, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    CopyArray17i
 * Signature: (JIII[II)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_CopyArray17i
  (JNIEnv *, jobject, jlong, jint, jint, jint, jintArray, jint);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    Set19
 * Signature: (JJ[J[J[J[J[JJ[J[J[J[J)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_Set19
  (JNIEnv *, jobject, jlong, jlong, jlongArray, jlongArray, jlongArray, jlongArray, jlongArray, jlong, jlongArray, jlongArray, jlongArray, jlongArray);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    Set19i
 * Signature: (JI[I[I[I[I[II[I[I[I[I)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_Set19i
  (JNIEnv *, jobject, jlong, jint, jintArray, jintArray, jintArray, jintArray, jintArray, jint, jintArray, jintArray, jintArray, jintArray);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    DataContainers20
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_DataContainers20
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueParametricLGRMap
 * Method:    DemandDataContainers21
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueParametricLGRMap_DemandDataContainers21
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif
