/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_Rescue_rjni_RescueInterfaceSurfaceDesc */

#ifndef _Included_org_Rescue_rjni_RescueInterfaceSurfaceDesc
#define _Included_org_Rescue_rjni_RescueInterfaceSurfaceDesc
#ifdef __cplusplus
extern "C" {
#endif
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_I_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_I_NDX 0L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_J_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_J_NDX 1L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_K_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_K_NDX 2L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_NDX 3L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_NDX 4L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_COUNT
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_COUNT 5L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_REF
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_REF 6L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_I_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_I_NDX 7L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_J_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_J_NDX 8L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_K_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_CELL_K_NDX 9L
#undef org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_ROW_NDX
#define org_Rescue_rjni_RescueInterfaceSurfaceDesc_FACE_ROW_NDX 10L
/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    Create_RescueInterfaceSurfaceDesc0
 * Signature: (JZJJJJ)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_Create_1RescueInterfaceSurfaceDesc0
  (JNIEnv *, jobject, jlong, jboolean, jlong, jlong, jlong, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    Delete_RescueInterfaceSurfaceDesc
 * Signature: (J)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_Delete_1RescueInterfaceSurfaceDesc
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    SetIsExterior2
 * Signature: (JZ)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_SetIsExterior2
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    SetFaceToCell3
 * Signature: (JJJJJJ[J[J[J[J)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_SetFaceToCell3
  (JNIEnv *, jobject, jlong, jlong, jlong, jlong, jlong, jlong, jlongArray, jlongArray, jlongArray, jlongArray);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    SetFaceToCell3i
 * Signature: (JIIIII[I[I[I[I)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_SetFaceToCell3i
  (JNIEnv *, jobject, jlong, jint, jint, jint, jint, jint, jintArray, jintArray, jintArray, jintArray);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    ReadFaceToCell4
 * Signature: (JJJJJJ[J[J[J[J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_ReadFaceToCell4
  (JNIEnv *, jobject, jlong, jlong, jlong, jlong, jlong, jlong, jlongArray, jlongArray, jlongArray, jlongArray);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    ReadFaceToCell4i
 * Signature: (JIIIII[I[I[I[I)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_ReadFaceToCell4i
  (JNIEnv *, jobject, jlong, jint, jint, jint, jint, jint, jintArray, jintArray, jintArray, jintArray);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    ReadCellToFace5
 * Signature: (JJJJJJ[J[J[J[J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_ReadCellToFace5
  (JNIEnv *, jobject, jlong, jlong, jlong, jlong, jlong, jlong, jlongArray, jlongArray, jlongArray, jlongArray);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    ReadCellToFace5i
 * Signature: (JIIIII[I[I[I[I)I
 */
JNIEXPORT jint JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_ReadCellToFace5i
  (JNIEnv *, jobject, jlong, jint, jint, jint, jint, jint, jintArray, jintArray, jintArray, jintArray);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    IsExterior6
 * Signature: (J)Z
 */
JNIEXPORT jboolean JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_IsExterior6
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceCount7
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceCount7
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceIndx8
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceIndx8
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceJndx9
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceJndx9
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceKndx10
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceKndx10
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceNdx11
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceNdx11
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellNdx12
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellNdx12
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellCount13
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellCount13
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceIndx8i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceIndx8i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceJndx9i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceJndx9i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceKndx10i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceKndx10i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceNdx11i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceNdx11i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellNdx12i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellNdx12i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellCount13i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellCount13i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellMapCount14
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellMapCount14
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellRef15
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellRef15
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellIndx16
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellIndx16
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellJndx17
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellJndx17
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellKndx18
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellKndx18
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceRowNdx19
 * Signature: (J)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceRowNdx19
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellRef15i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellRef15i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellIndx16i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellIndx16i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellJndx17i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellJndx17i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CellKndx18i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CellKndx18i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    FaceRowNdx19i
 * Signature: (JZ)[I
 */
JNIEXPORT jintArray JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_FaceRowNdx19i
  (JNIEnv *, jobject, jlong, jboolean);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CopyArray20
 * Signature: (JIJJ[JJ)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CopyArray20
  (JNIEnv *, jobject, jlong, jint, jlong, jlong, jlongArray, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    CopyArray20i
 * Signature: (JIII[II)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_CopyArray20i
  (JNIEnv *, jobject, jlong, jint, jint, jint, jintArray, jint);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    Set22
 * Signature: (JJ[J[J[J[J[J[JJ[J[J[J[J[J)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_Set22
  (JNIEnv *, jobject, jlong, jlong, jlongArray, jlongArray, jlongArray, jlongArray, jlongArray, jlongArray, jlong, jlongArray, jlongArray, jlongArray, jlongArray, jlongArray);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    Set22i
 * Signature: (JI[I[I[I[I[I[II[I[I[I[I[I)V
 */
JNIEXPORT void JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_Set22i
  (JNIEnv *, jobject, jlong, jint, jintArray, jintArray, jintArray, jintArray, jintArray, jintArray, jint, jintArray, jintArray, jintArray, jintArray, jintArray);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    DataContainers23
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_DataContainers23
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_Rescue_rjni_RescueInterfaceSurfaceDesc
 * Method:    DemandDataContainers24
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_Rescue_rjni_RescueInterfaceSurfaceDesc_DemandDataContainers24
  (JNIEnv *, jobject, jlong);

#ifdef __cplusplus
}
#endif
#endif