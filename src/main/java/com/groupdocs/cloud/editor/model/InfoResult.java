/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="InfoResult.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes document properties result
 */
@ApiModel(description = "Describes document properties result")
public class InfoResult {
  @SerializedName("pageCount")
  private Integer pageCount = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("isEncrypted")
  private Boolean isEncrypted = null;

  @SerializedName("fileFormat")
  private String fileFormat = null;

  @SerializedName("extension")
  private String extension = null;

  public InfoResult pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Pages count
   * @return pageCount
  **/
  @ApiModelProperty(required = true, value = "Pages count")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public InfoResult size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Document size in bytes
   * @return size
  **/
  @ApiModelProperty(required = true, value = "Document size in bytes")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public InfoResult isEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
    return this;
  }

   /**
   * Indicates whether specific file is encrypted and requires password for opening.
   * @return isEncrypted
  **/
  @ApiModelProperty(required = true, value = "Indicates whether specific file is encrypted and requires password for opening.")
  public Boolean getIsEncrypted() {
    return isEncrypted;
  }

  public void setIsEncrypted(Boolean isEncrypted) {
    this.isEncrypted = isEncrypted;
  }

  public InfoResult fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * File format
   * @return fileFormat
  **/
  @ApiModelProperty(value = "File format")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public InfoResult extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Document extension
   * @return extension
  **/
  @ApiModelProperty(value = "Document extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoResult infoResult = (InfoResult) o;
    return Objects.equals(this.pageCount, infoResult.pageCount) &&
        Objects.equals(this.size, infoResult.size) &&
        Objects.equals(this.isEncrypted, infoResult.isEncrypted) &&
        Objects.equals(this.fileFormat, infoResult.fileFormat) &&
        Objects.equals(this.extension, infoResult.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageCount, size, isEncrypted, fileFormat, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoResult {\n");
    
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    isEncrypted: ").append(toIndentedString(isEncrypted)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

