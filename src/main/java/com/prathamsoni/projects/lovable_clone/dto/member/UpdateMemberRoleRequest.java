package com.prathamsoni.projects.lovable_clone.dto.member;

import com.prathamsoni.projects.lovable_clone.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}
