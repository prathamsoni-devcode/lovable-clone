package com.prathamsoni.projects.lovable_clone.dto.member;

import com.prathamsoni.projects.lovable_clone.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
