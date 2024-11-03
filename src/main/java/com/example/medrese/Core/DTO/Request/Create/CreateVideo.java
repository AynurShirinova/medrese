package com.example.medrese.Core.DTO.Request.Create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CreateVideo {

    @NotBlank(message = "Video ID is required")
    @Size(max = 15, message = "Video ID cannot be longer than 15 characters")
    String videoId;

    String publishedAt;

    String thumbnail;

    @NotBlank(message = "Title is required")
    String title;

    @NotBlank(message = "Playlist ID is required")
    String playlistId;

}
