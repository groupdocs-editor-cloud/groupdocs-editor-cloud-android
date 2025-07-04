/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Options.java">
 *   Copyright (c) Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.editor.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.editor.model.FileInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes basic options properties
 */
@ApiModel(description = "Describes basic options properties")
public class Options {
  @SerializedName("fileInfo")
  private FileInfo fileInfo = null;

  @SerializedName("outputPath")
  private String outputPath = null;

  public Options fileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
    return this;
  }

   /**
   * File info
   * @return fileInfo
  **/
  @ApiModelProperty(value = "File info")
  public FileInfo getFileInfo() {
    return fileInfo;
  }

  public void setFileInfo(FileInfo fileInfo) {
    this.fileInfo = fileInfo;
  }

  public Options outputPath(String outputPath) {
    this.outputPath = outputPath;
    return this;
  }

   /**
   * The full output path
   * @return outputPath
  **/
  @ApiModelProperty(value = "The full output path")
  public String getOutputPath() {
    return outputPath;
  }

  public void setOutputPath(String outputPath) {
    this.outputPath = outputPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Options options = (Options) o;
    return Objects.equals(this.fileInfo, options.fileInfo) &&
        Objects.equals(this.outputPath, options.outputPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileInfo, outputPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Options {\n");
    
    sb.append("    fileInfo: ").append(toIndentedString(fileInfo)).append("\n");
    sb.append("    outputPath: ").append(toIndentedString(outputPath)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

