package com.felipemelozx.onebitflix.dto;

import java.util.List;

public record CategoryPageDTO(List<CategoryDTO> categories,
                              Integer page,
                              Integer perPage,
                              Long total) {
}
