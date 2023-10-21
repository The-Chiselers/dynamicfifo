// This confidential and proprietary software may be used only as authorized by
// Rocksavage Technology, Inc. In the event of publication the following
// notice is applicable:
//
// (C) COPYRIGHT 2023 ROCKSAVAGE TECHNOLOGY, INC.
// ALL RIGHTS RESERVED

package chiselWare

import chisel3._
import chisel3.util._

/** Default parameter settings for Dynamic FIFO
  *
  * @constructor
  *   default parameter settings
  * @param dataWidth
  *   specifies the width of the FIFO data
  * @param fifoDepth
  *   specifices the depth of the FIFO
  * @param externalRAM
  *   specifies whether to use an external SRAM or internal FFs
  * @param coverage
  *   specifies whether to calculate port coverage during sim
  * @author
  *   Warren Savage
  * @version 1.0
  * @todaseParamso
  * @see
  *   [[http://www.rocksavage.tech/DynamicFifo.html]] for more information
  *
  * <img src="" />
  */

case class BaseParams(
    dataWidth: Int = 8,
    fifoDepth: Int = 8,
    externalRam: Boolean = false,
    coverage: Boolean = false,
    bbFiles: List[String] = List("dual_port_sync_sram.v")
) {

  require((fifoDepth % 2) == 0, "Depth must be a power of 2")
  require(dataWidth >= 4, "Width must be greater than equal 4")
}
