package com.directi.training.ocp.exercise_refactored;

import java.util.HashMap;
import java.util.Map;

public class ResourceAllocator {
    private Map<ResourceType, Resource> resourceMap;

    public ResourceAllocator() {
        resourceMap = new HashMap<>();
        resourceMap.put(ResourceType.TIME_SLOT, new TimeSlotResource());
        resourceMap.put(ResourceType.SPACE_SLOT, new SpaceSlotResource());
    }

    public int allocate(ResourceType resourceType) {
        Resource resource = resourceMap.get(resourceType);
        if (resource != null) {
            return resource.allocate();
        }
        System.out.println("ERROR: Attempted to allocate an invalid resource");
        return -1;
    }

    public void free(ResourceType resourceType, int resourceId) {
        Resource resource = resourceMap.get(resourceType);
        if (resource != null) {
            resource.free(resourceId);
        } else {
            System.out.println("ERROR: Attempted to free an invalid resource");
        }
    }

    public void markBusy(ResourceType resourceType, int resourceId) {
        Resource resource = resourceMap.get(resourceType);
        if (resource != null) {
            resource.markBusy(resourceId);
        } else {
            System.out.println("ERROR: Attempted to mark busy for an invalid resource");
        }
    }

    public void markFree(ResourceType resourceType, int resourceId) {
        Resource resource = resourceMap.get(resourceType);
        if (resource != null) {
            resource.markFree(resourceId);
        } else {
            System.out.println("ERROR: Attempted to mark free for an invalid resource");
        }
    }
}
