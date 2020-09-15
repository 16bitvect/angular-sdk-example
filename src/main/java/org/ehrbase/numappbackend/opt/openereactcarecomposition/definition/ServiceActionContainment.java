package org.ehrbase.numappbackend.opt.openereactcarecomposition.definition;

import com.nedap.archie.rm.datastructures.Cluster;
import java.lang.String;
import java.time.temporal.TemporalAccessor;
import org.ehrbase.client.aql.containment.Containment;
import org.ehrbase.client.aql.field.AqlFieldImp;
import org.ehrbase.client.aql.field.ListAqlFieldImp;
import org.ehrbase.client.aql.field.ListSelectAqlField;
import org.ehrbase.client.aql.field.SelectAqlField;
import org.ehrbase.numappbackend.opt.shareddefinition.ServiceNameDefiningcode;
import org.ehrbase.numappbackend.opt.shareddefinition.TransitionDefiningcode;

public class ServiceActionContainment extends Containment {
  public SelectAqlField<ServiceAction> SERVICE_ACTION = new AqlFieldImp<ServiceAction>(ServiceAction.class, "", "ServiceAction", ServiceAction.class, this);

  public SelectAqlField<TemporalAccessor> TIME_VALUE = new AqlFieldImp<TemporalAccessor>(ServiceAction.class, "/time|value", "timeValue", TemporalAccessor.class, this);

  public ListSelectAqlField<Cluster> REQUESTOR = new ListAqlFieldImp<Cluster>(ServiceAction.class, "/protocol[at0015]/items[at0017]", "requestor", Cluster.class, this);

  public SelectAqlField<ServicePlannedDefiningcode> SERVICE_PLANNED_DEFININGCODE = new AqlFieldImp<ServicePlannedDefiningcode>(ServiceAction.class, "/ism_transition[at0002]/careflow_step|defining_code", "servicePlannedDefiningcode", ServicePlannedDefiningcode.class, this);

  public ListSelectAqlField<Cluster> RECEIVER = new ListAqlFieldImp<Cluster>(ServiceAction.class, "/protocol[at0015]/items[at0019]", "receiver", Cluster.class, this);

  public SelectAqlField<org.ehrbase.numappbackend.opt.shareddefinition.ServicePlannedDefiningcode> SERVICE_PLANNED_DEFININGCODE_CURRENT_STATE = new AqlFieldImp<org.ehrbase.numappbackend.opt.shareddefinition.ServicePlannedDefiningcode>(ServiceAction.class, "/ism_transition[at0002]/current_state|defining_code", "servicePlannedDefiningcodeCurrentState", org.ehrbase.numappbackend.opt.shareddefinition.ServicePlannedDefiningcode.class, this);

  public SelectAqlField<TransitionDefiningcode> TRANSITION_DEFININGCODE = new AqlFieldImp<TransitionDefiningcode>(ServiceAction.class, "/ism_transition[at0002]/transition|defining_code", "transitionDefiningcode", TransitionDefiningcode.class, this);

  public SelectAqlField<ServiceNameDefiningcode> SERVICE_NAME_DEFININGCODE = new AqlFieldImp<ServiceNameDefiningcode>(ServiceAction.class, "/description[at0001]/items[at0011]/value|defining_code", "serviceNameDefiningcode", ServiceNameDefiningcode.class, this);

  public ListSelectAqlField<Cluster> SERVICE_DETAIL = new ListAqlFieldImp<Cluster>(ServiceAction.class, "/description[at0001]/items[at0027]", "serviceDetail", Cluster.class, this);

  public ListSelectAqlField<Cluster> MULTIMEDIA = new ListAqlFieldImp<Cluster>(ServiceAction.class, "/description[at0001]/items[at0029]", "multimedia", Cluster.class, this);

  public SelectAqlField<String> DESCRIPTION_VALUE = new AqlFieldImp<String>(ServiceAction.class, "/description[at0001]/items[at0013]/value|value", "descriptionValue", String.class, this);

  private ServiceActionContainment() {
    super("openEHR-EHR-ACTION.service.v0");
  }

  public static ServiceActionContainment getInstance() {
    return new ServiceActionContainment();
  }
}