package HW1.submissions.partA.vincentsaw.doordash;

import java.util.ArrayList;
import java.util.List;

public class TrackingServiceImpl implements TrackingService {
    String packageEta;

    @Override
    public void trackPackage(String trackingNumber) {
        System.out.println("Package with tracking number " + trackingNumber + " is being tracked, expected arrival on " + packageEta);
    }

    //Additional function implementations
    @Override
    public void setPackageEta(String tn, String pe) {
        //Back-end tracking number lookup, assignment of eta to tracking number
        packageEta = pe;
    }

    @Override
    public String getPackageEta(String tn) {
        //Back-end tracking number lookup, retreival of eta based on tracking number
        return packageEta;
    }
}
